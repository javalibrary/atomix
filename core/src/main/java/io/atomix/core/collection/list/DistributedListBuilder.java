/*
 * Copyright 2015-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.core.collection.list;

import io.atomix.primitive.DistributedPrimitiveBuilder;
import io.atomix.primitive.PrimitiveManagementService;

/**
 * Builder for distributed queue.
 *
 * @param <E> queue element type
 */
public abstract class DistributedListBuilder<E> extends DistributedPrimitiveBuilder<DistributedListBuilder<E>, DistributedListConfig, DistributedList<E>> {
  public DistributedListBuilder(String name, DistributedListConfig config, PrimitiveManagementService managementService) {
    super(DistributedListType.instance(), name, config, managementService);
  }
}