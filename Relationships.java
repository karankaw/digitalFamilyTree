public enum Relationships
{
    HUSBAND(Gender.MALE),
    WIFE(Gender.FEMALE),
    FATHER(Gender.MALE),
    MOTHER(Gender.FEMALE),
    BROTHER(Gender.MALE),
    SISTER(Gender.FEMALE),
    SON(Gender.MALE),
    DAUGHTER(Gender.FEMALE),
    COUSIN(Gender.MALE),//For simplicity
    GRANDMOTHER(Gender.FEMALE),
    GRANDFATHER(Gender.MALE),
    GRANDSON(Gender.MALE),
    GRANDAUGHTER(Gender.FEMALE),
    AUNT(Gender.FEMALE),
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