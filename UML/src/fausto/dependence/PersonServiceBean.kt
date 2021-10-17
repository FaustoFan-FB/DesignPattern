package fausto.dependence

/**
 * @author: fausto
 * @date: 2021/10/15 17:27
 * @description:
 */
class PersonServiceBean(private var personDao: PersonDao) {
    fun save(person: Person){}
    fun getIDCard(personId: Int): IDCard{
        return IDCard()
    }
    fun modify(){
        val department = Department()
    }
}