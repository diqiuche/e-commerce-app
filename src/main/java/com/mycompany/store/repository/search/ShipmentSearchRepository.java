package com.mycompany.store.repository.search;

import com.mycompany.store.domain.Shipment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Shipment} entity.
 */
public interface ShipmentSearchRepository extends ElasticsearchRepository<Shipment, Long> {}
