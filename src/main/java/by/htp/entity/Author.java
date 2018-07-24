package by.htp.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Author {

	private int idAuthor;
	private String name;
	private String surname;
	private Calendar birthDate;

	public Author() {
		this.birthDate = new GregorianCalendar();
	}

	public Author(int idAuthor, String name, String surname, Calendar birthDate) {
		this.idAuthor = idAuthor;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int id) {
		this.idAuthor = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + idAuthor;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (idAuthor != other.idAuthor)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "\nAuthor: id=" + idAuthor + ", name=" + name + " " + surname + " , birthDate="
				+ birthDate.get(birthDate.DAY_OF_MONTH) + " "
				+ (birthDate.getDisplayName(birthDate.MONTH, Calendar.LONG_FORMAT, Locale.getDefault()) + " "
						+ birthDate.get(birthDate.YEAR));
	}

}
