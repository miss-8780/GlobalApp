package com.www.globalapp.lrc.view;

import com.www.globalapp.lrc.view.impl.LrcRow;

/**
 * 歌词拖动时候的监听类
 */
public interface ILrcViewListener {
    /**
     * 当歌词被用户上下拖动的时候回调该方法
     */
    void onLrcSeeked(int newPosition, LrcRow row);
}
