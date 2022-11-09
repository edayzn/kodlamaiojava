package kodlama.io.homework.WeekFourHomeWorkOne.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "subTechnologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SubTechnology {

	@Column(name = "subTechnologyId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subTechnologyId;
	
	@Column(name="subTechnologyName")
	private String subTechnologyName;
	
	@ManyToOne()
	@JoinColumn(name="language_id")
	private Language language;
	

}
