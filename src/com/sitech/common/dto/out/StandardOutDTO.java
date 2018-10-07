package com.sitech.common.dto.out;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * @Description: 标准的出参DTO
 * @createTime: 2014年9月29日 下午5:51:13
 */

public class StandardOutDTO extends OutDTO {
    private static final long serialVersionUID = -8512527356609332824L;

    @Override
    public MBean encode() {
        return new MBean();
    }

}
