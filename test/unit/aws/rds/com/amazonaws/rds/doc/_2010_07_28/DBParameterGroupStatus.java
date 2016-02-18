//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 01:23:02 PM CST 
//


package com.amazonaws.rds.doc._2010_07_28;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 <p>
 *                 The status of the DB parameter group.
 *                 </p>
 *                 <p>This data type is used as a response element in the following actions:</p>
 *                 <ul>
 *                     <li><a>CreateDBInstance</a></li>
 *                     <li><a>CreateDBInstanceReadReplica</a></li>
 *                     <li><a>DeleteDBInstance</a></li>
 *                     <li><a>ModifyDBInstance</a></li>
 *                     <li><a>RebootDBInstance</a></li>
 *                     <li><a>RestoreDBInstanceFromDBSnapshot</a></li>
 *                 </ul>
 *             
 * 
 * <p>Java class for DBParameterGroupStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBParameterGroupStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBParameterGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterApplyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBParameterGroupStatus", propOrder = {
    "dbParameterGroupName",
    "parameterApplyStatus"
})
public class DBParameterGroupStatus {

    @XmlElement(name = "DBParameterGroupName")
    protected String dbParameterGroupName;
    @XmlElement(name = "ParameterApplyStatus")
    protected String parameterApplyStatus;

    /**
     * Gets the value of the dbParameterGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBParameterGroupName() {
        return dbParameterGroupName;
    }

    /**
     * Sets the value of the dbParameterGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBParameterGroupName(String value) {
        this.dbParameterGroupName = value;
    }

    /**
     * Gets the value of the parameterApplyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * Sets the value of the parameterApplyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterApplyStatus(String value) {
        this.parameterApplyStatus = value;
    }

}