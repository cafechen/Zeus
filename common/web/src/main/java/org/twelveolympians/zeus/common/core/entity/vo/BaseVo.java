package org.twelveolympians.zeus.common.core.entity.vo;

import org.twelveolympians.zeus.common.core.entity.po.BasePo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BaseVo<T extends BasePo> implements Serializable {
    private String id;
}
