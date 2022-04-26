public class PersonBuilder {

    Person person = new Person();

    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    public Person build() {
        if (person.getName() == null || person.getSurname() == null) {
            throw new IllegalStateException("Отсутствует фамилия или имя!");
        } else if (person.getAge() < 0) {
            throw new IllegalArgumentException("Не корректно введён возраст.");
        }
        return person;
    }
}
