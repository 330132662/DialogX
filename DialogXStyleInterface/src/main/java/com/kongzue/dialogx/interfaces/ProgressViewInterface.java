package com.kongzue.dialogx.interfaces;

/**
 * author: Kongzue
 * github: https://github.com/kongzue/
 * homepage: http://kongzue.com/
 * mail: myzcxhh@live.cn
 * createTime: 2020/11/3 20:39
 */
public interface ProgressViewInterface {
    
    //ֹͣ���ض���
    void noLoading();
    
    //�л������״̬
    void success();
    
    //�л�������״̬
    void warning();
    
    //�л�������״̬
    void error();
    
    //�л������ȣ�ȡֵ 0f-1f��
    void progress(float progress);
    
    //�л�������״̬
    void loading();
    
    //��ͬ״̬�л�ʱ���νӶ�����ɺ�ִ��
    ProgressViewInterface whenShowTick(Runnable runnable);
    
    //������ɫ
    ProgressViewInterface setColor(int color);
}
