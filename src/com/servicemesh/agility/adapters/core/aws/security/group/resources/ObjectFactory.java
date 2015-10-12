//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.14 at 10:25:25 AM EDT 
//


package com.servicemesh.agility.adapters.core.aws.security.group.resources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amazonaws.ec2.doc._2013_10_15 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _AuthorizeSecurityGroupEgressResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "AuthorizeSecurityGroupEgressResponse");
    private final static QName _AuthorizeSecurityGroupIngressResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "AuthorizeSecurityGroupIngressResponse");
    private final static QName _CreateSecurityGroupResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "CreateSecurityGroupResponse");
    private final static QName _DeleteSecurityGroupResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "DeleteSecurityGroupResponse");
    private final static QName _DescribeSecurityGroupsResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "DescribeSecurityGroupsResponse");
    private final static QName _RevokeSecurityGroupEgressResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "RevokeSecurityGroupEgressResponse");
    private final static QName _RevokeSecurityGroupIngressResponse_QNAME = new QName("http://ec2.amazonaws.com/doc/2013-10-15/", "RevokeSecurityGroupIngressResponse");

   
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amazonaws.ec2.doc._2013_10_15
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link AuthorizeSecurityGroupEgressResponseType }
     * 
     */
    public AuthorizeSecurityGroupEgressResponseType createAuthorizeSecurityGroupEgressResponseType() {
        return new AuthorizeSecurityGroupEgressResponseType();
    }
    
    /**
     * Create an instance of {@link AuthorizeSecurityGroupIngressResponseType }
     * 
     */
    public AuthorizeSecurityGroupIngressResponseType createAuthorizeSecurityGroupIngressResponseType() {
        return new AuthorizeSecurityGroupIngressResponseType();
    }
    
    /**
     * Create an instance of {@link CreateSecurityGroupResponseType }
     * 
     */
    public CreateSecurityGroupResponseType createCreateSecurityGroupResponseType() {
        return new CreateSecurityGroupResponseType();
    }
    
    /**
     * Create an instance of {@link DeleteSecurityGroupResponseType }
     * 
     */
    public DeleteSecurityGroupResponseType createDeleteSecurityGroupResponseType() {
        return new DeleteSecurityGroupResponseType();
    }
    
    /**
     * Create an instance of {@link DescribeSecurityGroupsResponseType }
     * 
     */
    public DescribeSecurityGroupsResponseType createDescribeSecurityGroupsResponseType() {
        return new DescribeSecurityGroupsResponseType();
    }
    
    /**
     * Create an instance of {@link IpPermissionSetType }
     * 
     */
    public IpPermissionSetType createIpPermissionSetType() {
        return new IpPermissionSetType();
    }
    
    /**
     * Create an instance of {@link IpPermissionType }
     * 
     */
    public IpPermissionType createIpPermissionType() {
        return new IpPermissionType();
    }
    
    /**
     * Create an instance of {@link IpRangeItemType }
     * 
     */
    public IpRangeItemType createIpRangeItemType() {
        return new IpRangeItemType();
    }
    
    /**
     * Create an instance of {@link IpRangeSetType }
     * 
     */
    public IpRangeSetType createIpRangeSetType() {
        return new IpRangeSetType();
    }
    
    /**
     * Create an instance of {@link ResourceTagSetItemType }
     * 
     */
    public ResourceTagSetItemType createResourceTagSetItemType() {
        return new ResourceTagSetItemType();
    }
    
    /**
     * Create an instance of {@link ResourceTagSetType }
     * 
     */
    public ResourceTagSetType createResourceTagSetType() {
        return new ResourceTagSetType();
    }
    
    /**
     * Create an instance of {@link RevokeSecurityGroupEgressResponseType }
     * 
     */
    public RevokeSecurityGroupEgressResponseType createRevokeSecurityGroupEgressResponseType() {
        return new RevokeSecurityGroupEgressResponseType();
    }
    
    /**
     * Create an instance of {@link RevokeSecurityGroupIngressResponseType }
     * 
     */
    public RevokeSecurityGroupIngressResponseType createRevokeSecurityGroupIngressResponseType() {
        return new RevokeSecurityGroupIngressResponseType();
    }
    
    /**
     * Create an instance of {@link SecurityGroupItemType }
     * 
     */
    public SecurityGroupItemType createSecurityGroupItemType() {
        return new SecurityGroupItemType();
    }
    
    /**
     * Create an instance of {@link SecurityGroupSetType }
     * 
     */
    public SecurityGroupSetType createSecurityGroupSetType() {
        return new SecurityGroupSetType();
    }
    
    /**
     * Create an instance of {@link UserIdGroupPairSetType }
     * 
     */
    public UserIdGroupPairSetType createUserIdGroupPairSetType() {
        return new UserIdGroupPairSetType();
    }
    
    /**
     * Create an instance of {@link UserIdGroupPairType }
     * 
     */
    public UserIdGroupPairType createUserIdGroupPairType() {
        return new UserIdGroupPairType();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeSecurityGroupEgressResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "AuthorizeSecurityGroupEgressResponse")
    public JAXBElement<AuthorizeSecurityGroupEgressResponseType> createAuthorizeSecurityGroupEgressResponse(AuthorizeSecurityGroupEgressResponseType value) {
        return new JAXBElement<AuthorizeSecurityGroupEgressResponseType>(_AuthorizeSecurityGroupEgressResponse_QNAME, AuthorizeSecurityGroupEgressResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeSecurityGroupIngressResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "AuthorizeSecurityGroupIngressResponse")
    public JAXBElement<AuthorizeSecurityGroupIngressResponseType> createAuthorizeSecurityGroupIngressResponse(AuthorizeSecurityGroupIngressResponseType value) {
        return new JAXBElement<AuthorizeSecurityGroupIngressResponseType>(_AuthorizeSecurityGroupIngressResponse_QNAME, AuthorizeSecurityGroupIngressResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSecurityGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "CreateSecurityGroupResponse")
    public JAXBElement<CreateSecurityGroupResponseType> createCreateSecurityGroupResponse(CreateSecurityGroupResponseType value) {
        return new JAXBElement<CreateSecurityGroupResponseType>(_CreateSecurityGroupResponse_QNAME, CreateSecurityGroupResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSecurityGroupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "DeleteSecurityGroupResponse")
    public JAXBElement<DeleteSecurityGroupResponseType> createDeleteSecurityGroupResponse(DeleteSecurityGroupResponseType value) {
        return new JAXBElement<DeleteSecurityGroupResponseType>(_DeleteSecurityGroupResponse_QNAME, DeleteSecurityGroupResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribeSecurityGroupsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "DescribeSecurityGroupsResponse")
    public JAXBElement<DescribeSecurityGroupsResponseType> createDescribeSecurityGroupsResponse(DescribeSecurityGroupsResponseType value) {
        return new JAXBElement<DescribeSecurityGroupsResponseType>(_DescribeSecurityGroupsResponse_QNAME, DescribeSecurityGroupsResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeSecurityGroupEgressResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "RevokeSecurityGroupEgressResponse")
    public JAXBElement<RevokeSecurityGroupEgressResponseType> createRevokeSecurityGroupEgressResponse(RevokeSecurityGroupEgressResponseType value) {
        return new JAXBElement<RevokeSecurityGroupEgressResponseType>(_RevokeSecurityGroupEgressResponse_QNAME, RevokeSecurityGroupEgressResponseType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeSecurityGroupIngressResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec2.amazonaws.com/doc/2013-10-15/", name = "RevokeSecurityGroupIngressResponse")
    public JAXBElement<RevokeSecurityGroupIngressResponseType> createRevokeSecurityGroupIngressResponse(RevokeSecurityGroupIngressResponseType value) {
        return new JAXBElement<RevokeSecurityGroupIngressResponseType>(_RevokeSecurityGroupIngressResponse_QNAME, RevokeSecurityGroupIngressResponseType.class, null, value);
    }

}
