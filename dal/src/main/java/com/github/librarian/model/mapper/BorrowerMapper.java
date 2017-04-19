package com.github.librarian.model.mapper;

import com.github.librarian.model.entity.Borrower;
import com.github.librarian.model.entity.BorrowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    long countByExample(BorrowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int deleteByExample(BorrowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int insert(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int insertSelective(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    List<Borrower> selectByExample(BorrowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    Borrower selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int updateByExampleSelective(@Param("record") Borrower record, @Param("example") BorrowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int updateByExample(@Param("record") Borrower record, @Param("example") BorrowerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int updateByPrimaryKeySelective(Borrower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Wed Apr 19 18:06:19 CST 2017
     */
    int updateByPrimaryKey(Borrower record);
}