package com.sitech.layout.atom.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 文件操作
 */
public interface IFilesOperationAo {

    public OutDTO queryFilesList(InDTO inParam);

    public OutDTO delFiles(InDTO inParam);
}
