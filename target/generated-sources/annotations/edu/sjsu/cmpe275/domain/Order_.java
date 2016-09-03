package edu.sjsu.cmpe275.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, String> pickuptime;
	public static volatile SingularAttribute<Order, String> readytime;
	public static volatile SingularAttribute<Order, String> f_start_time;
	public static volatile SingularAttribute<Order, Integer> preparetime;
	public static volatile SingularAttribute<Order, Double> price;
	public static volatile SingularAttribute<Order, String> menuorders;
	public static volatile SingularAttribute<Order, Integer> id;
	public static volatile ListAttribute<Order, OrderMenu> menus;
	public static volatile SingularAttribute<Order, String> ordertime;
	public static volatile SingularAttribute<Order, Integer> userId;
	public static volatile SingularAttribute<Order, String> email;
	public static volatile SingularAttribute<Order, Integer> status;

}

