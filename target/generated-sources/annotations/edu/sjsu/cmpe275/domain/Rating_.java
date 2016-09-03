package edu.sjsu.cmpe275.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rating.class)
public abstract class Rating_ {

	public static volatile SingularAttribute<Rating, Boolean> rated;
	public static volatile SingularAttribute<Rating, Integer> orderId;
	public static volatile SingularAttribute<Rating, Integer> rating;
	public static volatile SingularAttribute<Rating, MenuItem> menuItem;
	public static volatile SingularAttribute<Rating, Integer> menuItemId;
	public static volatile SingularAttribute<Rating, Order> order;

}

