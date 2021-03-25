package com.codessquad.qna.controller;

import java.util.ArrayList;
import java.util.List;

public class PageUtil {
    private final int PAGE_COUNT = 6;

    private int previous;
    private List<Integer> pages;
    private int current;
    private int next;
    private int max;


    public PageUtil(int current, int totalPages) {
        this.previous = 0;
        this.current = current;
        this.max = totalPages;
        this.pages = createList();
        this.next = createNext();
    }

    private List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        if (max<=5) {
            int start = 1;
            int last = max;
            loopList (list, start, last);
        }

        else if (current / PAGE_COUNT < 1) {
            int start = 1;
            int last = 5;
            loopList (list, start, last);
        } else {

            int multi = current / PAGE_COUNT < 2 ? 1 : current / PAGE_COUNT - 1;

            int start = multi * 5 +1;
            int last = start + 4;

            if (last > max) {
                last = max;
            }

            loopList (list, start, last);
            this.previous = start - 1;
        }

        return list;
    }

    private int createNext() {
        int next = pages.get(pages.size() - 1);

        if (next == max) {
            return 0;
        }
        return next + 1;
    }

    private void loopList(List<Integer> list, Integer start, Integer last) {
        for (int pageNum = start; pageNum <= last; pageNum++) {
            list.add(pageNum);
        }
    }


    public Integer getPrevious() {
        return previous;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public Integer getNext() {
        return next;
    }

}
