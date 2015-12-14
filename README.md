==spring transactions (with jpa)==
uses embedded H2 (in memory) db
the db is initialised with schema.sql for tables and test-data.sql for data.
(one table with some content)

JPA:
persistence unit is defined in the persistence.xml file
the entitymanager factory is instantiated using a spring factoryBean (defined in spring xml)

we don't access the entityMgr directly in this example because we use springdata
to auto generate basic crud operation implementations
the entityManager is injected in the repository created by springdata (see also spring xml config)


 

 