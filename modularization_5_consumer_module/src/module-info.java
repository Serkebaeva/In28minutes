module modularization_5_consumer {
	requires modularization_4_service_provider;
	requires transitive java.logging;
}