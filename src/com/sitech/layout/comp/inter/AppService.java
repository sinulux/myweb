package com.sitech.layout.comp.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

public interface AppService {

    public OutDTO pageQueryServiceInfo(InDTO inParam);
    public OutDTO insertServiceInfo(InDTO inParam);
    public OutDTO updateServiceInfo(InDTO inParam);
    public OutDTO deleteServiceInfo(InDTO inParam);
    public OutDTO userLogin(InDTO inParam);
    public OutDTO readLoginCache(InDTO inParam);
}
