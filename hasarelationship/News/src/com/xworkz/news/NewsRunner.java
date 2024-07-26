package com.xworkz.news;

import com.xworkz.news.dao.NewDao;
import com.xworkz.news.dto.NewsDto;

public class NewsRunner {
    public static void main(String[] args) {

        NewsDto dto = new NewsDto();
        dto.name = "Vijaya Karnataka";
        dto.editor = "Bharath.A";
        dto.circulation = 147;
        dto.language = "Kannada";
        dto.price = 5.00;
        dto.issueDate = "04/12/2024";

        NewDao dao = new NewDao();
        dao.createNews(dto);
        dao.displayGardenInfo();
    }

}
