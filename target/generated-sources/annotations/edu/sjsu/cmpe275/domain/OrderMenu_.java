package edu.sjsu.cmpe275.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderMenu.class)
public abstract class OrderMenu_ {

	public static volatile SingularAttribute<OrderMenu, Integer> quantity;
	public static volatile SingularAttribute<OrderMenu, Integer> orderid;
	public static volatile SingularAttribute<OrderMenu, Double> rate;
	public static volatile SingularAttribute<OrderMenu, Order> p_order;
	public static volatile SingularAttribute<OrderMenu, Integer> menuid;
	public static volatile SingularAttribute<OrderMenu, Integer> id;

}

