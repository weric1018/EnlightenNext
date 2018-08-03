package com.ynet.web.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;

/**
 * Created by lichengji on 2017/12/16.
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//@XmlRootElement(name="HEAD")
public class HeadRequest {

  @NotBlank(message = "接口码为空")
  private String tranCode;

  @NotBlank(message = "交易日期为空")
  @Pattern(regexp = "^[0-9]*$")
  private String tranDate;

  @NotBlank(message = "交易时间为空")
  @Pattern(regexp = "^[0-9]*$")
  private String tranTime;

  private String prdNo;
  private String busType;
  private String txType;
}
