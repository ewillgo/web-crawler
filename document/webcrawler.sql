-- 任务类型表
create table task_type (
  id int not null auto_increment primary key comment '主键ID',
  name varchar(255) not null comment '类型名称',
  description varchar(2000) null comment '类型描述',
  package_name varchar(255) not null comment 'java类全路径',
  status bit not null default 1 comment '状态 0-禁用; 1-启动',
  oper_by int not null default 0 comment '操作人ID',
  deleted bit not null default 0 comment '删除状态',
  create_time datetime not null default current_timestamp comment '创建时间',
  update_time datetime null on update current_timestamp comment '更新时间'
) engine InnoDB charset utf8;

create unique index uniq_task_type_name on task_type(name);
create index idx_task_type_oper_by on task_type(oper_by);

-- 任务表
create table task (
  id int not null auto_increment primary key comment '主键ID',
  user_id int not null comment '用户ID',
  type_id int not null comment '类型ID',
  name varchar(255) not null comment '任务名称',
  description varchar(1000) null comment '任务描述',
  execute_type tinyint not null default 0 comment '任务执行类型 0-即时; 1-定时',
  status tinyint not null default 0 comment '任务状态 0-停止; 1-运行中; 2-暂停',
  cron_expression varchar(50) null comment 'cron表达式',
  oper_by int not null default 0 comment '操作人ID',
  deleted bit not null default 0 comment '删除状态',
  create_time datetime not null default current_timestamp comment '创建时间',
  update_time datetime null on update current_timestamp comment '更新时间'
) engine InnoDB charset utf8;

create index idx_task_user_id on task(user_id);
create index idx_task_type_id on task(type_id);
create unique index uniq_task_name on task(name);
create index idx_task_oper_by on task(oper_by);