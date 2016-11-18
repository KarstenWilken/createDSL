/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Part</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.wilkenk.ba.create.CreatePackage#getAttributePart()
 * @model
 * @generated
 */
public enum AttributePart implements Enumerator
{
  /**
   * The '<em><b>Attr Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTR_NAME_VALUE
   * @generated
   * @ordered
   */
  ATTR_NAME(0, "attrName", "attrName"),

  /**
   * The '<em><b>Attr Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTR_VALUE_VALUE
   * @generated
   * @ordered
   */
  ATTR_VALUE(1, "attrValue", "attrValue"),

  /**
   * The '<em><b>Attr Min Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTR_MIN_VALUE_VALUE
   * @generated
   * @ordered
   */
  ATTR_MIN_VALUE(2, "attrMinValue", "attrMinValue"),

  /**
   * The '<em><b>Attr Max Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTR_MAX_VALUE_VALUE
   * @generated
   * @ordered
   */
  ATTR_MAX_VALUE(3, "attrMaxValue", "attrMaxValue");

  /**
   * The '<em><b>Attr Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attr Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTR_NAME
   * @model name="attrName"
   * @generated
   * @ordered
   */
  public static final int ATTR_NAME_VALUE = 0;

  /**
   * The '<em><b>Attr Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attr Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTR_VALUE
   * @model name="attrValue"
   * @generated
   * @ordered
   */
  public static final int ATTR_VALUE_VALUE = 1;

  /**
   * The '<em><b>Attr Min Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attr Min Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTR_MIN_VALUE
   * @model name="attrMinValue"
   * @generated
   * @ordered
   */
  public static final int ATTR_MIN_VALUE_VALUE = 2;

  /**
   * The '<em><b>Attr Max Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attr Max Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTR_MAX_VALUE
   * @model name="attrMaxValue"
   * @generated
   * @ordered
   */
  public static final int ATTR_MAX_VALUE_VALUE = 3;

  /**
   * An array of all the '<em><b>Attribute Part</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributePart[] VALUES_ARRAY =
    new AttributePart[]
    {
      ATTR_NAME,
      ATTR_VALUE,
      ATTR_MIN_VALUE,
      ATTR_MAX_VALUE,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Part</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributePart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Part</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributePart get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributePart result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Part</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributePart getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributePart result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Part</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributePart get(int value)
  {
    switch (value)
    {
      case ATTR_NAME_VALUE: return ATTR_NAME;
      case ATTR_VALUE_VALUE: return ATTR_VALUE;
      case ATTR_MIN_VALUE_VALUE: return ATTR_MIN_VALUE;
      case ATTR_MAX_VALUE_VALUE: return ATTR_MAX_VALUE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private AttributePart(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //AttributePart
