package services.repository.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;

//@EqualsAndHashCode(of = {"fullName"})
//@ToString(of = {"fullName"})
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "journalists")
@ApiModel(description = "All details about the Journalist. ")
public class Journalist {

    @ApiModelProperty(notes = "The database generated journalist ID")
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "firstName", column = @Column(name = "firstName", nullable = false, length = 32)),
//            @AttributeOverride(name = "lastName", column = @Column(name = "lastName", nullable = false, length = 32))
//    })
//    @ApiModelProperty(notes = "The journalist full name")
//    private FullName fullName;

    @Column(name = "phone", nullable = false, length = 32)
    @ApiModelProperty(notes = "The journalist phone number")
    private String phone;
    @ApiModelProperty(notes = "The journalist email address")
    @Column(name = "email", nullable = false, length = 32)
    private String email;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "city", column = @Column(name = "address_city", nullable = false, length = 32)),
//            @AttributeOverride(name = "street", column = @Column(name = "address_street", nullable = false, length = 32)),
//            @AttributeOverride(name = "building", column = @Column(name = "address_building", nullable = false, length = 32))
//    })
//    @ApiModelProperty(notes = "The journalist home address")
//    private Address address;

//    @Column(name = "experience")
//    @OneToMany
//    @ApiModelProperty(notes = "The journalist experience")
//    private Experience experience;
//
//    public FullName getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(FullName fullName) {
//        this.fullName = fullName;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
