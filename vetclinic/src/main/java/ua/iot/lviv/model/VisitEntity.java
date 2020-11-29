package ua.iot.lviv.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "visit", schema = "s3_db_lab_5", catalog = "")
public class VisitEntity {
    private Long id;
    private Timestamp dateTime;
    private PetEntity petByPetId;
    private ServiceEntity serviceByServiceId;
    private ScheduleEntity scheduleByScheduleId;
    private DiagnosisEntity diagnosisByDiagnosisId;

    public VisitEntity() {
    }

    public VisitEntity(Long id, Timestamp dateTime, PetEntity petByPetId, ServiceEntity serviceByServiceId,
                       ScheduleEntity scheduleByScheduleId, DiagnosisEntity diagnosisByDiagnosisId) {
        this.id = id;
        this.dateTime = dateTime;
        this.petByPetId = petByPetId;
        this.serviceByServiceId = serviceByServiceId;
        this.scheduleByScheduleId = scheduleByScheduleId;
        this.diagnosisByDiagnosisId = diagnosisByDiagnosisId;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_time")
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisitEntity that = (VisitEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "pet_id", referencedColumnName = "id", nullable = false)
    public PetEntity getPetByPetId() {
        return petByPetId;
    }

    public void setPetByPetId(PetEntity petByPetId) {
        this.petByPetId = petByPetId;
    }

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id", nullable = false)
    public ServiceEntity getServiceByServiceId() {
        return serviceByServiceId;
    }

    public void setServiceByServiceId(ServiceEntity serviceByServiceId) {
        this.serviceByServiceId = serviceByServiceId;
    }

    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id", nullable = false)
    public ScheduleEntity getScheduleByScheduleId() {
        return scheduleByScheduleId;
    }

    public void setScheduleByScheduleId(ScheduleEntity scheduleByScheduleId) {
        this.scheduleByScheduleId = scheduleByScheduleId;
    }

    @ManyToOne
    @JoinColumn(name = "diagnosis_id", referencedColumnName = "id", nullable = false)
    public DiagnosisEntity getDiagnosisByDiagnosisId() {
        return diagnosisByDiagnosisId;
    }

    public void setDiagnosisByDiagnosisId(DiagnosisEntity diagnosisByDiagnosisId) {
        this.diagnosisByDiagnosisId = diagnosisByDiagnosisId;
    }

    @Override
    public String toString() {
        return "VisitEntity{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", petByPetId=" + petByPetId +
                ", serviceByServiceId=" + serviceByServiceId +
                ", scheduleByScheduleId=" + scheduleByScheduleId +
                ", diagnosisByDiagnosisId=" + diagnosisByDiagnosisId +
                '}';
    }
}
