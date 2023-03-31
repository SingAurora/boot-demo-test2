package fit.fancyday.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mobile_user_address
 */
@TableName(value ="mobile_user_address")
@Data
public class MobileUserAddress implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联主表的id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 真实姓名，5个字符内
     */
    @TableField(value = "real_name")
    private String realName;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 
     */
    @TableField(value = "province")
    private String province;

    /**
     * 市，5个字符内
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区
     */
    @TableField(value = "district")
    private String district;

    /**
     * 镇
     */
    @TableField(value = "town")
    private String town;

    /**
     * 详细地址
     */
    @TableField(value = "detailed_address")
    private String detailedAddress;

    /**
     * 是否默认 0 不是 1是
     */
    @TableField(value = "isDefault")
    private Integer isDefault;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MobileUserAddress other = (MobileUserAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getDetailedAddress() == null ? other.getDetailedAddress() == null : this.getDetailedAddress().equals(other.getDetailedAddress()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null :
                this.getIsDefault().equals(other.getIsDefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getDetailedAddress() == null) ? 0 : getDetailedAddress().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", userId=" + userId +
                ", realName=" + realName +
                ", phone=" + phone +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", town=" + town +
                ", detailedAddress=" + detailedAddress +
                ", isDefault=" + isDefault +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}