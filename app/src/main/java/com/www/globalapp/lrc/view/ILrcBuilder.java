package com.www.globalapp.lrc.view;

import com.www.globalapp.lrc.view.impl.LrcRow;
import java.util.List;

/**
 * 解析歌词，得到LrcRow的集合
 */
public interface ILrcBuilder {
    List<LrcRow> getLrcRows(String rawLrc);
}
