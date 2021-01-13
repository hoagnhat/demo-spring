package com.example.spring_demo2.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "demo_spring", catalog = "")
public class CategoryEntity {
    private long id;
    private String name;
    private Collection<TempEntity> tempsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @OneToMany(mappedBy = "categoryByCategoryId")
    public Collection<TempEntity> getTempsById() {
        return tempsById;
    }

    public void setTempsById(Collection<TempEntity> tempsById) {
        this.tempsById = tempsById;
    }
}
