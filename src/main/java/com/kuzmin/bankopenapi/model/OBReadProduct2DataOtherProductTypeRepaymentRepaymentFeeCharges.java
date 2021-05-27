package com.kuzmin.bankopenapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */
@Schema(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-27T13:08:18.830Z[GMT]")


public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges   {
  @JsonProperty("RepaymentFeeChargeDetail")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail>();

  @JsonProperty("RepaymentFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeDetail
   * @return repaymentFeeChargeDetail
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeCapItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
    if (this.repaymentFeeChargeCap == null) {
      this.repaymentFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap>();
    }
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeCap
   * @return repaymentFeeChargeCap
   **/
  @Schema(description = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges) o;
    return Objects.equals(this.repaymentFeeChargeDetail, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeDetail) &&
        Objects.equals(this.repaymentFeeChargeCap, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentFeeChargeDetail, repaymentFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges {\n");
    
    sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
    sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
