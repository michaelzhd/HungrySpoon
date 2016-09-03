package edu.sjsu.cmpe275.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MenuItem.class)
public abstract class MenuItem_ {

	public static volatile SingularAttribute<MenuItem, BigDecimal> unitPrice;
	public static volatile SingularAttribute<MenuItem, String> name;
	public static volatile SingularAttribute<MenuItem, Integer> preparationTime;
	public static volatile SingularAttribute<MenuItem, Double> rating;
	public static volatile SingularAttribute<MenuItem, Integer> id;
	public static volatile SingularAttribute<MenuItem, Integer> calories;
	public static volatile SingularAttribute<MenuItem, Integer> category;
	public static volatile SingularAttribute<MenuItem, String> picture;

}

