package edu.sjsu.cmpe275.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ChefSchedule.class)
public abstract class ChefSchedule_ {

	public static volatile SingularAttribute<ChefSchedule, Integer> orderId;
	public static volatile SingularAttribute<ChefSchedule, Integer> chefId;
	public static volatile SingularAttribute<ChefSchedule, Date> startTime;
	public static volatile SingularAttribute<ChefSchedule, Integer> id;
	public static volatile SingularAttribute<ChefSchedule, Date> endTime;

}

