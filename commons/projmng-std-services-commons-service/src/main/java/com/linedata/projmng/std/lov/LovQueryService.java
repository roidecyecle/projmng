package com.linedata.projmng.std.lov;

import java.util.List;

import com.linedata.ekip.commons.shared.bean.BeanWithId;
import com.linedata.ekip.std.dao.core.ExecutionContext;
import com.linedata.ekip.std.services.core.query.DataMap;
import com.linedata.projmng.std.lov.Entity.LovElement;

public interface LovQueryService extends BeanWithId
{

   String getValue(DataMap filters, String key);

   List<LovElement> getLov(ExecutionContext executionContext, String lovName, DataMap filters);

}
