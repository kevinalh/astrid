package com.todoroo.astrid.actfm.sync.messages;

import com.todoroo.astrid.dao.TaskListMetadataDao;
import com.todoroo.astrid.dao.TaskListMetadataOutstandingDao;
import com.todoroo.astrid.data.TaskListMetadata;
import com.todoroo.astrid.data.TaskListMetadataOutstanding;

public class ReplayTaskListMetadataOutstanding extends ReplayOutstandingEntries<TaskListMetadata, TaskListMetadataOutstanding> {

    public ReplayTaskListMetadataOutstanding(TaskListMetadataDao dao, TaskListMetadataOutstandingDao outstandingDao, boolean afterErrors) {
        super(TaskListMetadata.class, NameMaps.TABLE_ID_TASK_LIST_METADATA, dao, outstandingDao, afterErrors);
    }

    @Override
    protected void enqueueChangesHappenedMessage(long id) {
        // Do nothing
    }

}
