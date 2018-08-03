package com.ynet.web.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

/**
 * Created by lichengji on 2017/12/16.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HeadRespose {
  private String errorCode;
  private String errorMsg;
  @Pattern(regexp = "^[0-9]*$")
  private String jurDate;
  @Pattern(regexp = "^[0-9]*$")
  private String jurTime;
}
