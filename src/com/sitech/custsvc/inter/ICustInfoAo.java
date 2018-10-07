package com.sitech.custsvc.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

public interface ICustInfoAo {

    public OutDTO qryCustInfoById(InDTO inParam);

    public OutDTO qryCustInfoByPageCondition(InDTO inParam);

}
