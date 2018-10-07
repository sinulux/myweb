package com.sitech.layout.atom.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

public interface IMenuInfoDealAo {

    public OutDTO queryMenuInfo(InDTO inParam);

    public OutDTO pageQueryMenuInfo(InDTO inParam);

    public OutDTO querySysMenuIds(InDTO inParam);

    public OutDTO insSysMenuInfo(InDTO inParam);

    public OutDTO updSysMenuInfo(InDTO inParam);

    public OutDTO delSysMenuInfo(InDTO inParam);

    public OutDTO updSysMenuInfoFlag(InDTO inParam);
}
