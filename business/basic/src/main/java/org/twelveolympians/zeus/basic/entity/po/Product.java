package org.twelveolympians.zeus.basic.entity.po;

import com.baomidou.mybatisplus.annotation.TableLogic;
import org.twelveolympians.zeus.common.web.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BasePo {
    private String name;
    private String description;
    @TableLogic
    private String deleted = "N";
}
