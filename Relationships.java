public enum Relationships
{

    FATHER(Gender.MALE),
    MOTHER(Gender.MALE),
    BROTHER(Gender.MALE),
    SISTER(Gender.MALE),
    SON(Gender.MALE),
    DAUGHTER(Gender.MALE),
    COUSIN(Gender.MALE),
    GRANDMOTHER(Gender.MALE),
    GRANDFATHER(Gender.MALE),
    GRANDSON(Gender.MALE),
    GRANDAUGHTER(Gender.MALE),
    AUNT(Gender.MALE),
    UNCLE(Gender.MALE);

    Gender gender;

    Relationships(Gender gender)
    {
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

}