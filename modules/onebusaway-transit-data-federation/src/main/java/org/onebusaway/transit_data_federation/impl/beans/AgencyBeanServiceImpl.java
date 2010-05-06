package org.onebusaway.transit_data_federation.impl.beans;

import org.onebusaway.container.cache.Cacheable;
import org.onebusaway.gtfs.model.Agency;
import org.onebusaway.gtfs.services.GtfsRelationalDao;
import org.onebusaway.transit_data.model.AgencyBean;
import org.onebusaway.transit_data_federation.services.beans.AgencyBeanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class AgencyBeanServiceImpl implements AgencyBeanService {

  private GtfsRelationalDao _gtfsDao;

  @Autowired
  public void setGtfsDao(GtfsRelationalDao gtfsDao) {
    _gtfsDao = gtfsDao;
  }

  @Cacheable
  public AgencyBean getAgencyForId(String id) {
    Agency agency = _gtfsDao.getAgencyForId(id);
    if (agency == null)
      return null;
    AgencyBean bean = new AgencyBean();
    bean.setId(agency.getId());
    bean.setLang(agency.getLang());
    bean.setName(agency.getName());
    bean.setPhone(agency.getPhone());
    bean.setTimezone(agency.getTimezone());
    bean.setUrl(agency.getUrl());
    return bean;
  }
}