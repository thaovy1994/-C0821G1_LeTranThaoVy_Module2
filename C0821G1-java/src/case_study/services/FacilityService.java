package case_study.services;

import case_study.models.Facility;

public interface FacilityService extends Service {
    void create();
    void edit(Facility facility);
}
