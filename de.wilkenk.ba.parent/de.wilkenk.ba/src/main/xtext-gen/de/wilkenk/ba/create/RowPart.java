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
 * A representation of the literals of the enumeration '<em><b>Row Part</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.wilkenk.ba.create.CreatePackage#getRowPart()
 * @model
 * @generated
 */
public enum RowPart implements Enumerator
{
  /**
   * The '<em><b>Index</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDEX_VALUE
   * @generated
   * @ordered
   */
  INDEX(0, "index", "index"),

  /**
   * The '<em><b>Conditions</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONDITIONS_VALUE
   * @generated
   * @ordered
   */
  CONDITIONS(1, "conditions", "conditions"),

  /**
   * The '<em><b>Consequences</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSEQUENCES_VALUE
   * @generated
   * @ordered
   */
  CONSEQUENCES(2, "consequences", "consequences");

  /**
   * The '<em><b>Index</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Index</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INDEX
   * @model name="index"
   * @generated
   * @ordered
   */
  public static final int INDEX_VALUE = 0;

  /**
   * The '<em><b>Conditions</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conditions</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONDITIONS
   * @model name="conditions"
   * @generated
   * @ordered
   */
  public static final int CONDITIONS_VALUE = 1;

  /**
   * The '<em><b>Consequences</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Consequences</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSEQUENCES
   * @model name="consequences"
   * @generated
   * @ordered
   */
  public static final int CONSEQUENCES_VALUE = 2;

  /**
   * An array of all the '<em><b>Row Part</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RowPart[] VALUES_ARRAY =
    new RowPart[]
    {
      INDEX,
      CONDITIONS,
      CONSEQUENCES,
    };

  /**
   * A public read-only list of all the '<em><b>Row Part</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RowPart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Row Part</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RowPart get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RowPart result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Row Part</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RowPart getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RowPart result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Row Part</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RowPart get(int value)
  {
    switch (value)
    {
      case INDEX_VALUE: return INDEX;
      case CONDITIONS_VALUE: return CONDITIONS;
      case CONSEQUENCES_VALUE: return CONSEQUENCES;
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
  private RowPart(int value, String name, String literal)
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
  
} //RowPart
