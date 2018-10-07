package com.sitech.layout.comp.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

import java.io.IOException;

/**
 * 文件上传服务接口
 */
public interface IFileServiceCo {

    public OutDTO fileUpload(InDTO inParam) throws IOException;
    public OutDTO refreshHead(InDTO inParam);
}
