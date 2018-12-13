package guru.springframework.sfgpetclinic.model;

import sun.util.resources.LocaleData;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocaleData birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocaleData getBirthday() {
        return birthday;
    }

    public void setBirthday(LocaleData birthday) {
        this.birthday = birthday;
    }
}
