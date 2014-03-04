
package uk.co.listpoint.codelist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeListFindDraftsResponse6Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListFindDraftsResponse6Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DraftCodeListName" type="{http://www.listpoint.co.uk/messages/CodeList}FullName6Structure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListFindDraftsResponse6Type", namespace = "http://www.listpoint.co.uk/messages/CodeList", propOrder = {
    "count",
    "draftCodeListName"
})
public class CodeListFindDraftsResponse6Type {

    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "DraftCodeListName")
    protected List<FullName6Structure2> draftCodeListName;

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the draftCodeListName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the draftCodeListName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDraftCodeListName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullName6Structure2 }
     * 
     * 
     */
    public List<FullName6Structure2> getDraftCodeListName() {
        if (draftCodeListName == null) {
            draftCodeListName = new ArrayList<FullName6Structure2>();
        }
        return this.draftCodeListName;
    }

}
