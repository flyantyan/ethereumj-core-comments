/*
 * Copyright (c) [2016] [ <ether.camp> ]
 * This file is part of the ethereumJ library.
 *
 * The ethereumJ library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The ethereumJ library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ethereumJ library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ethereum.net.rlpx.discover.table;

/*
 * Created by kest on 5/25/15.
 */
public class KademliaOptions {
    // K桶：每一个K桶是最多包含K个条目的列表
    public static final int BUCKET_SIZE = 16;
    // 节点查询：同时查询的节点数量，一般是3
    public static final int ALPHA = 3;
    // 节点Id的二进制位数：也是路由表的列表数
    public static final int BINS = 256;
    // 节点的发现次数
    public static final int MAX_STEPS = 8;

    public static final long REQ_TIMEOUT = 300;
    // K桶刷新次数
    public static final long BUCKET_REFRESH = 7200;     //bucket refreshing interval in millis
    public static final long DISCOVER_CYCLE = 30;       //discovery cycle interval in seconds
}
