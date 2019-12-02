package com.aishang.springboot.po;

import javax.persistence.*;

@Table(name = "test_02..tb_visited")
public class TbVisited {
    @Id
    private Integer visited;

    /**
     * @return visited
     */
    public Integer getVisited() {
        return visited;
    }

    /**
     * @param visited
     */
    public void setVisited(Integer visited) {
        this.visited = visited;
    }
}