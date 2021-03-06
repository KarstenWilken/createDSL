/**
 * generated by Xtext 2.10.0
 */
package de.wilkenk.ba.create.util;

import de.wilkenk.ba.create.AddCombination;
import de.wilkenk.ba.create.Addition;
import de.wilkenk.ba.create.Attribute;
import de.wilkenk.ba.create.AttributeRaise;
import de.wilkenk.ba.create.AttributeRaiseType;
import de.wilkenk.ba.create.AttributeRef;
import de.wilkenk.ba.create.Category;
import de.wilkenk.ba.create.Combination;
import de.wilkenk.ba.create.CombinationCondition;
import de.wilkenk.ba.create.CombinationRaise;
import de.wilkenk.ba.create.CombinationRaiseType;
import de.wilkenk.ba.create.CombinationRef;
import de.wilkenk.ba.create.CombinedAttribute;
import de.wilkenk.ba.create.CombinedAttributeRef;
import de.wilkenk.ba.create.Condition;
import de.wilkenk.ba.create.ConditionTargets;
import de.wilkenk.ba.create.Consequence;
import de.wilkenk.ba.create.ConstantBasedRaise;
import de.wilkenk.ba.create.CreatePackage;
import de.wilkenk.ba.create.DecisionTable;
import de.wilkenk.ba.create.DecisionTableRef;
import de.wilkenk.ba.create.DeleteCombination;
import de.wilkenk.ba.create.Dice;
import de.wilkenk.ba.create.DiceBasedRaise;
import de.wilkenk.ba.create.DicePart;
import de.wilkenk.ba.create.DiceRef;
import de.wilkenk.ba.create.Domainmodel;
import de.wilkenk.ba.create.Entity;
import de.wilkenk.ba.create.InitAttribute;
import de.wilkenk.ba.create.InitialAttributeDecision;
import de.wilkenk.ba.create.IntRef;
import de.wilkenk.ba.create.MathExpression;
import de.wilkenk.ba.create.Multiplication;
import de.wilkenk.ba.create.Property;
import de.wilkenk.ba.create.Raise;
import de.wilkenk.ba.create.Row;
import de.wilkenk.ba.create.RowRef;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.wilkenk.ba.create.CreatePackage
 * @generated
 */
public class CreateSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CreatePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CreatePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CreatePackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CHARACTER:
      {
        de.wilkenk.ba.create.Character character = (de.wilkenk.ba.create.Character)theEObject;
        T result = caseCharacter(character);
        if (result == null) result = caseEntity(character);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseEntity(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ATTRIBUTE_REF:
      {
        AttributeRef attributeRef = (AttributeRef)theEObject;
        T result = caseAttributeRef(attributeRef);
        if (result == null) result = caseMathExpression(attributeRef);
        if (result == null) result = caseConditionTargets(attributeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.INITIAL_ATTRIBUTE_DECISION:
      {
        InitialAttributeDecision initialAttributeDecision = (InitialAttributeDecision)theEObject;
        T result = caseInitialAttributeDecision(initialAttributeDecision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.INIT_ATTRIBUTE:
      {
        InitAttribute initAttribute = (InitAttribute)theEObject;
        T result = caseInitAttribute(initAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseEntity(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINED_ATTRIBUTE:
      {
        CombinedAttribute combinedAttribute = (CombinedAttribute)theEObject;
        T result = caseCombinedAttribute(combinedAttribute);
        if (result == null) result = caseEntity(combinedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINED_ATTRIBUTE_REF:
      {
        CombinedAttributeRef combinedAttributeRef = (CombinedAttributeRef)theEObject;
        T result = caseCombinedAttributeRef(combinedAttributeRef);
        if (result == null) result = caseConditionTargets(combinedAttributeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.MATH_EXPRESSION:
      {
        MathExpression mathExpression = (MathExpression)theEObject;
        T result = caseMathExpression(mathExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.INT_REF:
      {
        IntRef intRef = (IntRef)theEObject;
        T result = caseIntRef(intRef);
        if (result == null) result = caseMathExpression(intRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINATION:
      {
        Combination combination = (Combination)theEObject;
        T result = caseCombination(combination);
        if (result == null) result = caseEntity(combination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINATION_REF:
      {
        CombinationRef combinationRef = (CombinationRef)theEObject;
        T result = caseCombinationRef(combinationRef);
        if (result == null) result = caseConditionTargets(combinationRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINATION_CONDITION:
      {
        CombinationCondition combinationCondition = (CombinationCondition)theEObject;
        T result = caseCombinationCondition(combinationCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DICE:
      {
        Dice dice = (Dice)theEObject;
        T result = caseDice(dice);
        if (result == null) result = caseEntity(dice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DICE_REF:
      {
        DiceRef diceRef = (DiceRef)theEObject;
        T result = caseDiceRef(diceRef);
        if (result == null) result = caseMathExpression(diceRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DICE_PART:
      {
        DicePart dicePart = (DicePart)theEObject;
        T result = caseDicePart(dicePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.RAISE:
      {
        Raise raise = (Raise)theEObject;
        T result = caseRaise(raise);
        if (result == null) result = caseEntity(raise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ATTRIBUTE_RAISE:
      {
        AttributeRaise attributeRaise = (AttributeRaise)theEObject;
        T result = caseAttributeRaise(attributeRaise);
        if (result == null) result = caseRaise(attributeRaise);
        if (result == null) result = caseEntity(attributeRaise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ATTRIBUTE_RAISE_TYPE:
      {
        AttributeRaiseType attributeRaiseType = (AttributeRaiseType)theEObject;
        T result = caseAttributeRaiseType(attributeRaiseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DICE_BASED_RAISE:
      {
        DiceBasedRaise diceBasedRaise = (DiceBasedRaise)theEObject;
        T result = caseDiceBasedRaise(diceBasedRaise);
        if (result == null) result = caseAttributeRaiseType(diceBasedRaise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CONSTANT_BASED_RAISE:
      {
        ConstantBasedRaise constantBasedRaise = (ConstantBasedRaise)theEObject;
        T result = caseConstantBasedRaise(constantBasedRaise);
        if (result == null) result = caseAttributeRaiseType(constantBasedRaise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINATION_RAISE:
      {
        CombinationRaise combinationRaise = (CombinationRaise)theEObject;
        T result = caseCombinationRaise(combinationRaise);
        if (result == null) result = caseRaise(combinationRaise);
        if (result == null) result = caseEntity(combinationRaise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.COMBINATION_RAISE_TYPE:
      {
        CombinationRaiseType combinationRaiseType = (CombinationRaiseType)theEObject;
        T result = caseCombinationRaiseType(combinationRaiseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ADD_COMBINATION:
      {
        AddCombination addCombination = (AddCombination)theEObject;
        T result = caseAddCombination(addCombination);
        if (result == null) result = caseCombinationRaiseType(addCombination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DELETE_COMBINATION:
      {
        DeleteCombination deleteCombination = (DeleteCombination)theEObject;
        T result = caseDeleteCombination(deleteCombination);
        if (result == null) result = caseCombinationRaiseType(deleteCombination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DECISION_TABLE:
      {
        DecisionTable decisionTable = (DecisionTable)theEObject;
        T result = caseDecisionTable(decisionTable);
        if (result == null) result = caseEntity(decisionTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.DECISION_TABLE_REF:
      {
        DecisionTableRef decisionTableRef = (DecisionTableRef)theEObject;
        T result = caseDecisionTableRef(decisionTableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ROW:
      {
        Row row = (Row)theEObject;
        T result = caseRow(row);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ROW_REF:
      {
        RowRef rowRef = (RowRef)theEObject;
        T result = caseRowRef(rowRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CONDITION_TARGETS:
      {
        ConditionTargets conditionTargets = (ConditionTargets)theEObject;
        T result = caseConditionTargets(conditionTargets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.CONSEQUENCE:
      {
        Consequence consequence = (Consequence)theEObject;
        T result = caseConsequence(consequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseMathExpression(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CreatePackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseMathExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacter(de.wilkenk.ba.create.Character object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRef(AttributeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Attribute Decision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Attribute Decision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialAttributeDecision(InitialAttributeDecision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitAttribute(InitAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combined Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combined Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinedAttribute(CombinedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combined Attribute Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combined Attribute Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinedAttributeRef(CombinedAttributeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathExpression(MathExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntRef(IntRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombination(Combination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combination Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combination Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinationRef(CombinationRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combination Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combination Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinationCondition(CombinationCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDice(Dice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dice Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dice Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiceRef(DiceRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dice Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dice Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDicePart(DicePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRaise(Raise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRaise(AttributeRaise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Raise Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Raise Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRaiseType(AttributeRaiseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dice Based Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dice Based Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiceBasedRaise(DiceBasedRaise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Based Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Based Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantBasedRaise(ConstantBasedRaise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combination Raise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combination Raise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinationRaise(CombinationRaise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combination Raise Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combination Raise Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinationRaiseType(CombinationRaiseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Combination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Combination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddCombination(AddCombination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Combination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Combination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteCombination(DeleteCombination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTable(DecisionTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Table Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Table Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTableRef(DecisionTableRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRow(Row object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Row Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowRef(RowRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Targets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Targets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionTargets(ConditionTargets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsequence(Consequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CreateSwitch
