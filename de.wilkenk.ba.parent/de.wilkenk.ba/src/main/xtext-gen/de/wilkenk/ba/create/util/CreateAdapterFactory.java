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
import de.wilkenk.ba.create.DiceRef;
import de.wilkenk.ba.create.Domainmodel;
import de.wilkenk.ba.create.Entity;
import de.wilkenk.ba.create.InitAttribute;
import de.wilkenk.ba.create.InitialAttributeDecision;
import de.wilkenk.ba.create.MathExpression;
import de.wilkenk.ba.create.Multiplication;
import de.wilkenk.ba.create.Operation;
import de.wilkenk.ba.create.Property;
import de.wilkenk.ba.create.Raise;
import de.wilkenk.ba.create.Row;
import de.wilkenk.ba.create.RowRef;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.wilkenk.ba.create.CreatePackage
 * @generated
 */
public class CreateAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CreatePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CreatePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateSwitch<Adapter> modelSwitch =
    new CreateSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseCharacter(de.wilkenk.ba.create.Character object)
      {
        return createCharacterAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeRef(AttributeRef object)
      {
        return createAttributeRefAdapter();
      }
      @Override
      public Adapter caseInitialAttributeDecision(InitialAttributeDecision object)
      {
        return createInitialAttributeDecisionAdapter();
      }
      @Override
      public Adapter caseInitAttribute(InitAttribute object)
      {
        return createInitAttributeAdapter();
      }
      @Override
      public Adapter caseCategory(Category object)
      {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseCombinedAttribute(CombinedAttribute object)
      {
        return createCombinedAttributeAdapter();
      }
      @Override
      public Adapter caseCombinedAttributeRef(CombinedAttributeRef object)
      {
        return createCombinedAttributeRefAdapter();
      }
      @Override
      public Adapter caseMathExpression(MathExpression object)
      {
        return createMathExpressionAdapter();
      }
      @Override
      public Adapter caseCombination(Combination object)
      {
        return createCombinationAdapter();
      }
      @Override
      public Adapter caseCombinationRef(CombinationRef object)
      {
        return createCombinationRefAdapter();
      }
      @Override
      public Adapter caseCombinationCondition(CombinationCondition object)
      {
        return createCombinationConditionAdapter();
      }
      @Override
      public Adapter caseDice(Dice object)
      {
        return createDiceAdapter();
      }
      @Override
      public Adapter caseDiceRef(DiceRef object)
      {
        return createDiceRefAdapter();
      }
      @Override
      public Adapter caseRaise(Raise object)
      {
        return createRaiseAdapter();
      }
      @Override
      public Adapter caseAttributeRaise(AttributeRaise object)
      {
        return createAttributeRaiseAdapter();
      }
      @Override
      public Adapter caseAttributeRaiseType(AttributeRaiseType object)
      {
        return createAttributeRaiseTypeAdapter();
      }
      @Override
      public Adapter caseDiceBasedRaise(DiceBasedRaise object)
      {
        return createDiceBasedRaiseAdapter();
      }
      @Override
      public Adapter caseConstantBasedRaise(ConstantBasedRaise object)
      {
        return createConstantBasedRaiseAdapter();
      }
      @Override
      public Adapter caseCombinationRaise(CombinationRaise object)
      {
        return createCombinationRaiseAdapter();
      }
      @Override
      public Adapter caseCombinationRaiseType(CombinationRaiseType object)
      {
        return createCombinationRaiseTypeAdapter();
      }
      @Override
      public Adapter caseAddCombination(AddCombination object)
      {
        return createAddCombinationAdapter();
      }
      @Override
      public Adapter caseDeleteCombination(DeleteCombination object)
      {
        return createDeleteCombinationAdapter();
      }
      @Override
      public Adapter caseDecisionTable(DecisionTable object)
      {
        return createDecisionTableAdapter();
      }
      @Override
      public Adapter caseDecisionTableRef(DecisionTableRef object)
      {
        return createDecisionTableRefAdapter();
      }
      @Override
      public Adapter caseRow(Row object)
      {
        return createRowAdapter();
      }
      @Override
      public Adapter caseRowRef(RowRef object)
      {
        return createRowRefAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionTargets(ConditionTargets object)
      {
        return createConditionTargetsAdapter();
      }
      @Override
      public Adapter caseConsequence(Consequence object)
      {
        return createConsequenceAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Character
   * @generated
   */
  public Adapter createCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.AttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.AttributeRef
   * @generated
   */
  public Adapter createAttributeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.InitialAttributeDecision <em>Initial Attribute Decision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.InitialAttributeDecision
   * @generated
   */
  public Adapter createInitialAttributeDecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.InitAttribute <em>Init Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.InitAttribute
   * @generated
   */
  public Adapter createInitAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Category
   * @generated
   */
  public Adapter createCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinedAttribute <em>Combined Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinedAttribute
   * @generated
   */
  public Adapter createCombinedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinedAttributeRef <em>Combined Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinedAttributeRef
   * @generated
   */
  public Adapter createCombinedAttributeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.MathExpression <em>Math Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.MathExpression
   * @generated
   */
  public Adapter createMathExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Combination <em>Combination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Combination
   * @generated
   */
  public Adapter createCombinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinationRef <em>Combination Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinationRef
   * @generated
   */
  public Adapter createCombinationRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinationCondition <em>Combination Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinationCondition
   * @generated
   */
  public Adapter createCombinationConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Dice <em>Dice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Dice
   * @generated
   */
  public Adapter createDiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.DiceRef <em>Dice Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.DiceRef
   * @generated
   */
  public Adapter createDiceRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Raise <em>Raise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Raise
   * @generated
   */
  public Adapter createRaiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.AttributeRaise <em>Attribute Raise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.AttributeRaise
   * @generated
   */
  public Adapter createAttributeRaiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.AttributeRaiseType <em>Attribute Raise Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.AttributeRaiseType
   * @generated
   */
  public Adapter createAttributeRaiseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.DiceBasedRaise <em>Dice Based Raise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.DiceBasedRaise
   * @generated
   */
  public Adapter createDiceBasedRaiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.ConstantBasedRaise <em>Constant Based Raise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.ConstantBasedRaise
   * @generated
   */
  public Adapter createConstantBasedRaiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinationRaise <em>Combination Raise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinationRaise
   * @generated
   */
  public Adapter createCombinationRaiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.CombinationRaiseType <em>Combination Raise Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.CombinationRaiseType
   * @generated
   */
  public Adapter createCombinationRaiseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.AddCombination <em>Add Combination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.AddCombination
   * @generated
   */
  public Adapter createAddCombinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.DeleteCombination <em>Delete Combination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.DeleteCombination
   * @generated
   */
  public Adapter createDeleteCombinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.DecisionTable <em>Decision Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.DecisionTable
   * @generated
   */
  public Adapter createDecisionTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.DecisionTableRef <em>Decision Table Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.DecisionTableRef
   * @generated
   */
  public Adapter createDecisionTableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Row
   * @generated
   */
  public Adapter createRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.RowRef <em>Row Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.RowRef
   * @generated
   */
  public Adapter createRowRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.ConditionTargets <em>Condition Targets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.ConditionTargets
   * @generated
   */
  public Adapter createConditionTargetsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Consequence <em>Consequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Consequence
   * @generated
   */
  public Adapter createConsequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wilkenk.ba.create.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wilkenk.ba.create.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CreateAdapterFactory
