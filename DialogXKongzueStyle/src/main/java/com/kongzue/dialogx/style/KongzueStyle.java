package com.kongzue.dialogx.style;

import android.content.Context;

import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.ProgressViewInterface;
import com.kongzue.dialogx.kongzuetheme.R;

/**
 * @author: Kongzue
 * @github: https://github.com/kongzue/
 * @homepage: http://kongzue.com/
 * @mail: myzcxhh@live.cn
 * @createTime: 2020/9/26 13:09
 */
public class KongzueStyle implements DialogXStyle {
    
    public static KongzueStyle style() {
        return new KongzueStyle();
    }
    
    @Override
    public int layout(boolean light) {
        return light ? R.layout.layout_dialogx_kongzue : R.layout.layout_dialogx_kongzue_dark;
    }
    
    @Override
    public int enterAnimResId() {
        return 0;
    }
    
    @Override
    public int exitAnimResId() {
        return 0;
    }
    
    @Override
    public int[] verticalButtonOrder() {
        return new int[]{BUTTON_OK, BUTTON_OTHER, BUTTON_CANCEL};
    }
    
    @Override
    public int[] horizontalButtonOrder() {
        return new int[]{BUTTON_CANCEL, BUTTON_OTHER, BUTTON_OK};
    }
    
    @Override
    public int splitWidthPx() {
        return 0;
    }
    
    @Override
    public int splitColorRes(boolean light) {
        return 0;
    }
    
    @Override
    public BlurBackgroundSetting messageDialogBlurSettings() {
        return null;
    }
    
    @Override
    public HorizontalButtonRes overrideHorizontalButtonRes() {
        return null;
    }
    
    @Override
    public VerticalButtonRes overrideVerticalButtonRes() {
        return null;
    }
    
    @Override
    public WaitTipRes overrideWaitTipRes() {
        return new WaitTipRes() {
            @Override
            public int overrideWaitLayout(boolean light) {
                return 0;
            }
    
            @Override
            public int overrideRadiusPx() {
                return -1;
            }
            
            @Override
            public boolean blurBackground() {
                return false;
            }
            
            @Override
            public int overrideBackgroundColorRes(boolean light) {
                return 0;
            }
            
            @Override
            public int overrideTextColorRes(boolean light) {
                return light ? R.color.white : R.color.black;
            }
    
            @Override
            public ProgressViewInterface overrideWaitView(Context context, boolean light) {
                return null;
            }
        };
    }
    
    @Override
    public BottomDialogRes overrideBottomDialogRes() {
        return new BottomDialogRes() {
            
            @Override
            public boolean touchSlide() {
                return false;
            }
            
            @Override
            public int overrideDialogLayout(boolean light) {
                return light ? R.layout.layout_dialogx_bottom_kongzue : R.layout.layout_dialogx_bottom_kongzue_dark;
            }
            
            @Override
            public int overrideMenuDividerDrawableRes(boolean light) {
                return light ? R.color.dialogxKongzueButtonSplitLineColor : R.color.dialogxKongzueDarkButtonSplitLineColor;
            }
            
            @Override
            public int overrideMenuDividerHeight(boolean light) {
                return 1;
            }
            
            @Override
            public int overrideMenuTextColor(boolean light) {
                return light ? R.color.black90 : R.color.white90;
            }
            
            @Override
            public float overrideBottomDialogMaxHeight() {
                return 0.6f;
            }
            
            @Override
            public int overrideMenuItemLayout(boolean light, int index, int count, boolean isContentVisibility) {
                return light ? R.layout.item_dialogx_kongzue_bottom_menu_normal_text : R.layout.item_dialogx_kongzue_bottom_menu_normal_text_dark;
            }
    
            @Override
            public int overrideSelectionMenuBackgroundColor(boolean light) {
                return 0;
            }
    
            @Override
            public boolean selectionImageTint(boolean light) {
                return true;
            }
            
            @Override
            public int overrideSelectionImage(boolean light, boolean isSelected) {
                return 0;
            }
        };
    }
    
    @Override
    public PopTipSettings popTipSettings() {
        return new PopTipSettings() {
            @Override
            public int layout(boolean light) {
                return light?R.layout.layout_dialogx_poptip_kongzue :R.layout.layout_dialogx_poptip_kongzue_dark;
            }
            
            @Override
            public ALIGN align() {
                return ALIGN.TOP_INSIDE;
            }
            
            @Override
            public int enterAnimResId(boolean b) {
                return R.anim.anim_dialogx_kongzue_top_enter;
            }
            
            @Override
            public int exitAnimResId(boolean b) {
                return R.anim.anim_dialogx_kongzue_top_exit;
            }
        };
    }
}
