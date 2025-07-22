# work.mcfunction - 主事件调度器

# 权限检查（仅允许有 event_trigger 标签的玩家执行）
execute unless entity @s[tag=event_trigger] run {
    tellraw @s {"text":"你没有权限触发此事件","color":"red"}
    return
}

# 1. 全局计时器更新（每刻+1）
scoreboard players add #global_timer global 1

# 2. 事件触发条件：每2400刻（2分钟）触发一次
execute if score #global_timer global matches 2400 run {
    # 重置计时器
    scoreboard players set #global_timer global 0
    
    # 3. 随机选择事件（1或2）
    execute store result score #rand global run random 1 2
    
    # 4. 根据随机数执行对应事件
    execute if score #rand global matches 1 run function events:no_1
    execute if score #rand global matches 2 run function events:no_2
}

# 5. 倒计时提示（每100刻=5秒提示一次）
execute if score #global_timer global matches 100..2400 if score #global_timer global % 100 = 0 run {
    tellraw @a {"text":"下一次事件将在 ", "color":"yellow", "extra":[
        {"text":"${(2400 - #global_timer.global) / 20}秒", "color":"gold", "italic":true},
        {"text":" 后触发", "color":"yellow"}
    ]}
}

# init.mcfunction - 初始化所有需要的计分板

# 全局计时器（控制事件触发周期）
scoreboard objectives add #global_timer dummy
scoreboard players set #global_timer global 0

# 随机数生成（决定执行哪个事件）
scoreboard objectives add #rand dummy
scoreboard players set #rand global 0

# no_1 需要的计分板
scoreboard objectives add random dummy

# no_2 需要的计分板
scoreboard objectives add #event2_active dummy
scoreboard objectives add #event2_timer dummy
scoreboard players set #event2_active global 0
scoreboard players set #event2_timer global 0