package com.hiroshi.cimoc.ui.view;

import com.hiroshi.cimoc.model.Task;

import java.util.List;

/**
 * Created by Hiroshi on 2016/9/7.
 */
public interface TaskView extends BaseView {

    void onTaskLoadSuccess(List<Task> list);

    void onTaskLoadFail();

    void onLastChange(String path);

    void onTaskAdd(List<Task> list);

    void onTaskParse(long id);

    void onTaskProcess(long id, int progress, int max);

    void onTaskPause(long id);

    void onTaskError(long id);

    void onTaskDeleteSuccess(List<Long> list);

    void onTaskDeleteFail();

}
